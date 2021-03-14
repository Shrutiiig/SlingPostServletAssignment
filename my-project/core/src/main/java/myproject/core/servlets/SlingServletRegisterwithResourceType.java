//import javax.servlet.Servlet;
//import java.io.IOException;
//import org.osgi.service.component.annotations.Component;
//import org.apache.felix.scr.annotations.sling.SlingServlet;
//import org.apache.sling.api.SlingHttpServletRequest;
//import org.apache.sling.api.SlingHttpServletResponse;
//import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
////import org.apache.sling.jcr.api.SlingRepository;
////import org.apache.felix.scr.annotations.Property;
////import org.apache.felix.scr.annotations.Properties;
//import java.util.UUID;
//import org.json.simple.JSONObject;
//
////@Component(metatype = true)
////@Service(Servlet.class)
////@Properties({
////        @Property(name = "sling.servlet.paths", value = "/libs/myservlet"),
////})
//
////
////@SlingServlet(
////        resourceTypes = "myproject/components/page",
////        selectors={"hello","hello1"}
////        )
//
////@SlingServlet(paths="/bin/mySearchServlet", methods = "POST", metatype=true)
//
//@SlingServlet(paths="/bin/mySearchServlet", methods = "POST", metatype=true)
//
//public class SlingServletRegisterwithResourceType extends SlingSafeMethodsServlet{
//    @Override
//    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException{
////        Resource resource = request.getResource();
////        response.getWriter().println("Title=" + resource.getValueMap().get("jar : title"));
////        response.getWriter().println("PageTitle=" + resource.getValueMap().get("pageTitle"));
////        response.getWriter().println(resource.toString());
////        response.getWriter().println("Servlet is registered by Path");
//
//        try
//        {
//            //Get the submitted form data that is sent from the
//            //CQ web page
//            String id = UUID.randomUUID().toString();
//            String firstName = request.getParameter("firstName");
//            String lastName = request.getParameter("lastName");
//            String address = request.getParameter("address");
//            String cat = request.getParameter("cat");
//            String state = request.getParameter("state");
//            String details = request.getParameter("details");
//            String date = request.getParameter("date");
//            String city = request.getParameter("city");
////
////            //Encode the submitted form data to JSON
////            JSONObject obj=new JSONObject();
////            obj.put("id",id);
////            obj.put("firstname",firstName);
////            obj.put("lastname",lastName);
////            obj.put("address",address);
////            obj.put("cat",cat);
////            obj.put("state",state);
////            obj.put("details",details);
////            obj.put("date",date);
////            obj.put("city",city);
////
////            //Get the JSON formatted data
////            String jsonData = obj.toJSONString();
////
////            //Return the JSON formatted data
////            response.getWriter().write(jsonData);
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//}
