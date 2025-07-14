package com.Marvellous.MarvellousPortal.Repostiroy;

import com.Marvellous.MarvellousPortal.Entity.BatchEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepositry extends MongoRepository<BatchEntry, ObjectId>
{

}
