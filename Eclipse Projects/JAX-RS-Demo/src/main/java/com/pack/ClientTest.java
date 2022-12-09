//package com.pack;
//
//public class ClientTest {  
//  public static void main(String[] args) {  
//    ClientConfig config = new ClientConfig();  
//    Client client = ClientBuilder.newClient(config);  
//    WebTarget target = client.target(getBaseURI());  
//    //Now printing the server code of different media type  
//    System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class));  
//    System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class));  
//    System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class));  
//  }  
//  private static URI getBaseURI() {  
//    //here server is running on 4444 port number and project name is restfuljersey  
//    return UriBuilder.fromUri("http://localhost:4444/restfuljersey").build();  
//  }  
//}  s