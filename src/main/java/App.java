import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args) {

        port(getHerokuAssignedPort());
        staticFileLocation("/public");

        post("/herosform/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("specialPower");
            String weakness = request.queryParams("weakness");
            Hero newMember = new Hero(name, age, power,weakness);
            model.put("heros", Hero.getAll());
            return new ModelAndView(model, "herosuccess.hbs");
        }, new HandlebarsTemplateEngine());
        get("/herosform/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "heroform-input.hbs");
        }, new HandlebarsTemplateEngine());
        get("/receivedheroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Hero> heroes = Hero.getAll();
            model.put("heroes", heroes);
            return new ModelAndView(model, "displayheroes.hbs");
        }, new HandlebarsTemplateEngine());


        post("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("squadName");
            String cause = request.queryParams("cause");
            int size=Integer.parseInt(request.queryParams("size"));
            Squad newSquad = new Squad(size,name, cause);
            model.put("squads", Squad.getAll());
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
        get("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "squadform.hbs");
        }, new HandlebarsTemplateEngine());
        get("/receivedsquad", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Squad> squads = Squad.getAll();
            model.put("squads", squads);
            return new ModelAndView(model, "display.hbs");
        }, new HandlebarsTemplateEngine());



        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
        get("/success", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
        get("/herosdetails", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "display.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
