package main.artfix;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AdditionalFunctions {
    public static class Jwiki {
        final String BASE_URL = "https://en.wikipedia.org/api/rest_v1/page/summary/";
        String subject;
        String displayTitle = "";
        String imageURL = "";
        String extractText = "";

        public Jwiki(String subject) {
            this.subject = subject;
            getData();

        }

        private void getData() {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(BASE_URL + subject)
                    .get()
                    .build();
            try {
                Response response = client.newCall(request).execute();
                String data = response.body().string();
                JSONParser parser = new JSONParser();
                JSONObject jsonObject = (JSONObject) parser.parse(data);

                //get title from JSON response
                displayTitle = (String) jsonObject.get("displaytitle");

                //first create a image object and then get image URL
                JSONObject jsonObjectOriginalImage = (JSONObject) jsonObject.get("originalimage");
                imageURL = (String) jsonObjectOriginalImage.get("source");


                //get text
                extractText = (String) jsonObject.get("extract");

            } catch (Exception e) {
                System.out.println("Sorry, But I Can't Find Information About: " + Application.ask);
            }

        }

        public String getImageURL() {
            return imageURL;
        }

        public String getExtractText() {
            return extractText;
        }




        public static class SearchNoRes {
            public static void Search(String searchName) {
                System.out.println(searchName);
                Jwiki jwiki = new Jwiki(searchName);
                System.out.println(jwiki.getExtractText());
                System.out.println(jwiki.getImageURL());
            }
        }
    }
}
