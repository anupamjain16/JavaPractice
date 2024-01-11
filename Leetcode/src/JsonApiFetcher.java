import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonApiFetcher {

	public static void main(String[] args) {
		String apiUrl = "https://jsonmock.hackerrank.com/api/universities"; // Replace with your actual API URL

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).header("Accept", "application/json")
				.build();

		CompletableFuture<HttpResponse<String>> responseFuture = client.sendAsync(request, BodyHandlers.ofString());

		responseFuture.thenAccept(response -> {
			if (response.statusCode() == 200) {
				String jsonResponse = response.body();

				System.out.println("JSON Response: " + jsonResponse);

				int totalInternationalStudents = 0;

				JSONObject jsonObject = new JSONObject(jsonResponse);
				JSONArray dataArray = jsonObject.getJSONArray("data");
				int maxCount = 0;
				JSONObject maxUniversity = null;

				for (int i = 0; i < dataArray.length(); i++) {

					JSONObject universityObject = dataArray.getJSONObject(i);
					String internationalStudentsCount = universityObject.getString("international_students");
					//System.out.println("internationalStudentsCount " + internationalStudentsCount);

					int count = Integer.parseInt(internationalStudentsCount.replaceAll(",", "")); // Remove commas for
																									// parsing

					if (count > maxCount) {
						maxCount = count;
						maxUniversity = universityObject;
					}

					totalInternationalStudents += count;
				}

				String universityName = null;
				if (maxUniversity != null) {
					universityName = maxUniversity.getString("university");

				}

				if (universityName != null) {
					System.out.println(
							"University with most international students: " + universityName + "Counts " + maxCount);
				} else {
					System.out.println("No university data found.");
				}

				// Process the JSON data here
			} else {
				System.err.println("Error fetching data: " + response.statusCode());
			}
		}).join(); // Wait for the response to complete
	}
}
