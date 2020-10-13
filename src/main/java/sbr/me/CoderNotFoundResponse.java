package sbr.me;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Generazione della pagina di errore
 * @ControllerAdvice gli dico come generare delle pagine di response
 * @author romie
 *
 */
@ControllerAdvice
public class CoderNotFoundResponse {
	
	//mi chiami questa funzionalità quando c'è il CoderNotFoundException
    @ResponseBody
    @ExceptionHandler(CoderNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    String messageGenerator(CoderNotFoundException ex) {
        return ex.getMessage();
    }
}