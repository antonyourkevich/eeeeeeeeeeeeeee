
import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class API {

	private static final String CLIENT_ID = "6918387";
	private static final String VERSION = "5.92";

	public String getToken() {
		String token = "cd23481858bae734fb6ea1fa0ee92042deebd904780375c6a34c840fcf3dd97aee55d48fde946e2f61e2b";
		return token;
	}


	private String getWallID(String id) {
		return id.replaceAll("[^0-9]", "");
	}

	private String getResponseID(String id) {
		return id.replaceAll("[^0-9]", "");
	}
	
	
	public String toPost(String ownerId, String message) {
		HttpClient client = HttpClientBuilder.create().build();
		String ID = null;

		
		
		try {
			ID = getWallID(EntityUtils.toString(response.getEntity()));
			HttpGet request = new HttpGet(builder.build());
			URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.post?");
			builder.setParameter("access_token", getToken()).setParameter("owner_id", ownerId)
					.setParameter("message", message).setParameter("v", VERSION);
			HttpResponse response = client.execute(request);

		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return ID;
	}

	public String editThePost(String ownerId, String post_id, String message) {
		HttpClient client = HttpClientBuilder.create().build();
		String responseId = null;
		try {
			URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.edit?");
			builder.setParameter("access_token", getToken()).setParameter("owner_id", ownerId)
					.setParameter("post_id", post_id).setParameter("message", message).setParameter("v", VERSION);
			responseId = getResponseID(EntityUtils.toString(response.getEntity()));
			HttpResponse response = client.execute(request);
			HttpGet request = new HttpGet(builder.build());
			
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return responseId;
	}

	public String DeletethePost(String ownerId, String post_id) {
		HttpClient client = HttpClientBuilder.create().build();
		String responseId = null;
		try {
			URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.delete?");
			builder.setParameter("access_token", getToken()).setParameter("owner_id", ownerId)
					.setParameter("post_id", post_id).setParameter("v", VERSION);
			responseId = getResponseID(EntityUtils.toString(response.getEntity()));
			HttpResponse response = client.execute(request);
			HttpGet request = new HttpGet(builder.build());
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		return responseId;
	}

	
	
	

}
