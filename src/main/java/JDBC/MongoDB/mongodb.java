package JDBC.MongoDB;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import com.mongodb.reactivestreams.client.MongoCollection;
import com.mongodb.reactivestreams.client.MongoDatabase;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;

public class mongodb {


    public static void main(String[] args) throws InterruptedException {
        // you can use these credentials until there are any overwrite conflicts, then talk to Paul
        ConnectionString connectionString = new ConnectionString("mongodb+srv://rai-sahil:Tkdcrc987@cluster0.dibrkuh.mongodb.net/?retryWrites=true&w=majority");
        // settings for connecting to MongoDB
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .serverApi(ServerApi.builder()
                        .version(ServerApiVersion.V1)
                        .build())
                .build();
        // connect to MongoDB
        MongoClient mongoClient = MongoClients.create(settings);
        // Use this database unless there are overwrite conflicts
        MongoDatabase database = mongoClient.getDatabase("comp2522fall2022");

        // Replace "test" with your group name
        MongoCollection<Document> collection = database.getCollection("test");

        Thread.sleep(5000);
        // Create a document
        Document doc = new Document("name", "Sahil")
                .append("score", 1200);

        // Async calls may execute in any order
        // insert document
        collection.insertOne(doc)
                // subscribe takes a class that defines the callback
                .subscribe(new SubscriberHelpers.OperationSubscriber<InsertOneResult>());
        // find document
        collection.find(eq("name", "Sahil"))
                // subscribe takes a class that defines the callback
                .first().subscribe(new SubscriberHelpers.PrintDocumentSubscriber());

        // TODO: I strongly suggest saving local copies of your BSON/JSON data.
        // Since this is a shared login, there is no guarantee that someone will not
        // overwrite your data. You can make your own free MongoDB Atlas instance as well.


    }
}