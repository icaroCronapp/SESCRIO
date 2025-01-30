package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Query {

public static final int TIMEOUT = 300;

/**
 *
 * @author Ícaro Antunes
 * @since 30/01/2025, 14:12:41
 *
 */
public static Var produtoGet() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.database.Operations.query(Var.valueOf("farmacia.entity.Produto"),Var.valueOf("select \n	p \nfrom \n	Produto p"));
   }
 }.call();
}

}

