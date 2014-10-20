package rest;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


import com.sun.jersey.spi.container.servlet.ServletContainer;
 
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            startServer();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

	/**
	 * @throws Exception
	 * @throws InterruptedException
	 */
	public static void startServer() throws Exception, InterruptedException {
		Server server = new Server(8089);
		
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");
		
		ServletHolder servletHolder = new ServletHolder(ServletContainer.class);
		servletHolder.setInitParameter("com.sun.jersey.config.property.resourceConfigClass",
		        "com.sun.jersey.api.core.PackagesResourceConfig");
		servletHolder.setInitParameter("com.sun.jersey.config.property.packages", "rest");
		servletHolder.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");
		context.addServlet(servletHolder, "/*");
 
		server.setHandler(context);
 
		server.start();
		server.join();
	}
}
