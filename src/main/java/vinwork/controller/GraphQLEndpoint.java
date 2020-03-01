//package vinwork.controller;
//
//import javax.servlet.annotation.WebServlet;
//
//import graphql.schema.GraphQLSchema;
//import graphql.servlet.SimpleGraphQLServlet;
//import vinwork.repository.GreetingRepository;
//
//@WebServlet(urlPatterns = "/graphql")
//public class GraphQLEndpoint extends SimpleGraphQLServlet {
//
//    public GraphQLEndpoint() {
//        super(buildSchema());
//    }
//
//    private static GraphQLSchema buildSchema() {
//        GreetingRepository greetingRepository = new GreetingRepository();
//        return SchemaParser.newParser()
//                .file("greeting.graphqls")
//                .resolvers(new Query(greetingRepository))
//                .build()
//                .makeExecutableSchema();
//    }
//}