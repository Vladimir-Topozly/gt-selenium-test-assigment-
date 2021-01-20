import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITests {
    private String baseUrl = "https://x.gloat.com/";
    private String endpoint = "careers";


    @Test
    public void makeSureThePageIsUp() {
        given().when().get(baseUrl + endpoint)
                .then().assertThat().statusCode(200);
    }

    @Test
    public void verifyURL() {
        endpoint = "careers/nyc";
        given().when().get(baseUrl + endpoint)
                .then().assertThat().statusCode(200);
    }

    @Test
    public void verifyURLContentType() {
        given().when().get(baseUrl + endpoint)
                .then().assertThat().contentType(ContentType.HTML);
    }

    @Test
    public void verifyInvalidURL() {
        endpoint = "@#$";
        given().when().get(baseUrl + endpoint)
                .then().assertThat().statusCode(404);
    }
}