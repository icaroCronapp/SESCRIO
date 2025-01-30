package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Teste {

public static final int TIMEOUT = 300;

/**
 *
 * @author Ícaro Antunes
 * @since 29/01/2025, 15:15:37
 *
 */
public static void funcTest() throws Exception {
  new Callable<Var>() {

   private Var num = Var.VAR_NULL;
   private Var resultado = Var.VAR_NULL;

   public Var call() throws Exception {
    num =
    Var.valueOf(10);
    if (
    cronapi.math.Operations.isEven(num).getObjectAsBoolean()) {
        resultado =
        Var.valueOf(" é par");
    } else {
        resultado =
        Var.valueOf(" é ímpar");
    }
    System.out.println(
    Var.valueOf(
    num.getObjectAsString() +
    resultado.getObjectAsString()).getObjectAsString());
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Ícaro Antunes
 * @since 29/01/2025, 15:15:37
 *
 */
public static Var verificanumero() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    if (
    Var.valueOf(
    Var.valueOf(1).equals(
    Var.valueOf(1))).getObjectAsBoolean()) {
        item =
        Var.valueOf("verdade");
    } else {
        item =
        Var.valueOf("mentira");
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

