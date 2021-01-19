import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class APITests {

    @Test
    public void makeSureThePageIsUp() {
        given().when().get("https://x.gloat.com/careers/")
                .then().assertThat().statusCode(200);
    }

    @Test
    public void verifyURL() {
        given().when().get("https://x.gloat.com/careers/nyc")
                .then().assertThat().statusCode(200);
    }

    @Test
    public void verifyInvalidURL() {
        given().when().get("https://x.gloat.com/careers/4444")
                .then().assertThat().statusCode(404);
    }

}