package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
import java.util.concurrent.Callable;


@CronappSwagger
@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * @author Ícaro Antunes
 * @since 29/01/2025, 17:51:14
 *
 */
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    Var.valueOf("Cronapp SESC!");
    return item;
   }
 }.call();
}

}

