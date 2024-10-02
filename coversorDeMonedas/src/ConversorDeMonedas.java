import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class ConversorDeMonedas {
    private static final String API_KEY = "557af2b1f701fe030ba297a2";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public static double ObtenerTasaDeCambio(String base, String destino) throws Exception {
        String urlDestino = API_URL + base;

        URL url = new  URL(urlDestino);

        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();

        conexion.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            respuesta.append(inputLine);
        }
        in.close();

        JsonObject jsonRespuesta = JsonParser.parseString(respuesta.toString()).getAsJsonObject();
        JsonObject rates = jsonRespuesta.getAsJsonObject("conversion_rates");

        return rates.get(destino).getAsDouble();

    }

    public static double convertir(double cantidad, String base, String destino) throws Exception{
        double tasa = ObtenerTasaDeCambio(base, destino);

        return cantidad * tasa;
    }



}


