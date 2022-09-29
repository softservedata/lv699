package org.example;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.Vector;
import com.mongodb.client.*;
import com.mongodb.client.model.Sorts;



import javax.print.Doc;

public class MongoDB {
    private config config;

    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    MongoDB() {
        this.mongoClient = MongoClients.create(config.mongoLink);
        this.database = mongoClient.getDatabase(config.mongoDBName);
        this.collection = database.getCollection(config.mongoColectionName);

        System.out.println(collection.countDocuments() + " documents finded.");
    }

    public Vector<String> getAll() {
        Vector<String> tempArray = new Vector<String>();

        MongoCursor<Document> cursor = collection.find().sort(Sorts.ascending("date")).iterator();
        try {
            while (cursor.hasNext()) {
                tempArray.add(cursor.next().toJson());
            }
        } finally {
            cursor.close();
        }
        return tempArray;
    }

    public Document getFirst() {
        return collection.find().first();
    }

    public void addOne(Document doc) {
        this.collection.insertOne(doc);
    }

    public void removeOne(String _id) {
        this.collection.deleteOne(new Document("_id", new ObjectId(_id)));
    }


}
