package hw04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameOfHttpErrorTest {
    final NameOfHttpError nameOfHttpError = new NameOfHttpError();
    @Test
    void getError400() {
        assertEquals("Bad Request",nameOfHttpError.getError(400).getName());
        assertEquals(400,nameOfHttpError.getError(400).getCode());
    }
    @Test
    void getError401() {
        assertEquals("Unauthorized",nameOfHttpError.getError(401).getName());
        assertEquals(401,nameOfHttpError.getError(401).getCode());
    }
    @Test
    void getError402() {
        assertEquals("Payment Required",nameOfHttpError.getError(402).getName());
        assertEquals(402,nameOfHttpError.getError(402).getCode());
    }
    @Test
    void getError403() {
        assertEquals("Forbidden",nameOfHttpError.getError(403).getName());
        assertEquals(403,nameOfHttpError.getError(403).getCode());
    }
    @Test
    void getError404() {
        assertEquals("Not Found",nameOfHttpError.getError(404).getName());
        assertEquals(404,nameOfHttpError.getError(404).getCode());
    }
    @Test
    void getError0() {
        assertEquals("Please enter an error number from 400 to 404",nameOfHttpError.getError(0).getName());
    }
    @Test
    void getErrorToString() {
        assertEquals("Name error: Bad Request, Code error: 400",nameOfHttpError.getError(400).toString());
    }

}