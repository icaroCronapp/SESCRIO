package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class MongoDB {

public static final int TIMEOUT = 300;

/**
 *
 * @author Fábio Duarte Freitas
 * @since 03/02/2025, 15:49:04
 *
 */
public static Var Atualizar() throws Exception {
 return new Callable<Var>() {

   private Var connectionString = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    connectionString =
    Var.valueOf("mongodb+srv://Fabio:QFf8AbuMb3ESWTiT@docflix.hqah2.mongodb.net/?retryWrites=true&w=majority&appName=DocFlix");
    item =
    cronapp.framework.mongodb.Operations.update(connectionString,
    Var.valueOf("sample_mflix"),
    Var.valueOf("movies"),
    Var.valueOf("{ \'id\':\'xpto\' }"),
    Var.valueOf("{\'$set\' : {\'title\': \'Teste Romano 2\'} }"));
    System.out.println(
    Var.valueOf("Atualizados:").getObjectAsString());
    System.out.println(item.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Fábio Duarte Freitas
 * @since 03/02/2025, 15:49:04
 *
 */
public static Var Consultar() throws Exception {
 return new Callable<Var>() {

   private Var connectionString = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    connectionString =
    Var.valueOf("mongodb+srv://Fabio:QFf8AbuMb3ESWTiT@docflix.hqah2.mongodb.net/?retryWrites=true&w=majority&appName=DocFlix");
    item =
    cronapp.framework.mongodb.Operations.find(connectionString,
    Var.valueOf("sample_mflix"),
    Var.valueOf("movies"),
    Var.valueOf("{ \'$or\': [ { \'title\': \'Aes\' }, { \'id\': \'xpto\' } ] }"));
    System.out.println(
    Var.valueOf("Resultado:").getObjectAsString());
    System.out.println(item.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Fábio Duarte Freitas
 * @since 03/02/2025, 15:49:04
 *
 */
public static Var Deletar() throws Exception {
 return new Callable<Var>() {

   private Var connectionString = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    connectionString =
    Var.valueOf("mongodb+srv://Fabio:QFf8AbuMb3ESWTiT@docflix.hqah2.mongodb.net/?retryWrites=true&w=majority&appName=DocFlix");
    item =
    cronapp.framework.mongodb.Operations.delete(connectionString,
    Var.valueOf("sample_mflix"),
    Var.valueOf("movies"),
    Var.valueOf("{ \'id\':\'xpto\' }"));
    System.out.println(
    Var.valueOf("Deletados:").getObjectAsString());
    System.out.println(item.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param name
 *
 * @author Fábio Duarte Freitas
 * @since 03/02/2025, 15:49:04
 *
 */
public static Var Inserir(@ParamMetaData(description = "name", id = "9c0fa979") @RequestBody(required = false) Var name) throws Exception {
 return new Callable<Var>() {

   private Var connectionString = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    connectionString =
    Var.valueOf("mongodb+srv://Fabio:QFf8AbuMb3ESWTiT@docflix.hqah2.mongodb.net/?retryWrites=true&w=majority&appName=DocFlix");
    item =
    cronapp.framework.mongodb.Operations.insert(connectionString,
    Var.valueOf("sample_mflix"),
    Var.valueOf("movies"),
    Var.valueOf(
    Var.valueOf("{\'title\':\'").getObjectAsString() +
    name.getObjectAsString() +
    Var.valueOf("\'}").getObjectAsString()));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("vars.input2311"),
    cronapi.conversion.Operations.toString(item));
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf("Filme inserido com sucesso"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

