package lk.ijse.webservice.resource_access;

import lk.ijse.webservice.resource_access.api.ResourceAccessRest;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.SessionIdManager;
import org.eclipse.jetty.server.session.DefaultSessionIdManager;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class RestServer {
    private Server server;


    public void start() throws Exception {
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        context.addServlet(ResourceAccessRest.class, "/hello");
        server.setHandler(context);
        server.start();
        server.join();
//        server = new Server();
//        ServerConnector connector = new ServerConnector(server);
//        connector.setPort(8080);
//        server.setConnectors(new Connector[]{connector});
//
//        ServletContextHandler context=new ServletContextHandler(ServletContextHandler.SESSIONS);
//
//        // Specify the Session ID Manager
//        SessionIdManager idmanager = new DefaultSessionIdManager(server);
//        server.setSessionIdManager(idmanager);
//
//        SessionHandler sessionHandler= new SessionHandler();
//        sessionHandler.setSessionIdManager(idmanager);
//
//        ServletHandler servletHandler = new ServletHandler();
//        context.setHandler(servletHandler);
//
//
//        servletHandler.addServletWithMapping(ResourceAccessRest.class, "/hello");
//
//
//        context.setHandler(sessionHandler);
//
//
//        server.setHandler(context);
//        server.start();
    }
}