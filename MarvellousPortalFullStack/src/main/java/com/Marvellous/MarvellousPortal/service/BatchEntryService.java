package com.Marvellous.MarvellousPortal.service;

import com.Marvellous.MarvellousPortal.Entity.BatchEntry;
import com.Marvellous.MarvellousPortal.Repostiroy.BatchEntryRepositry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
    // C : Create
    //POST
    @Autowired
    private BatchEntryRepositry batchEntryRepositry;

    public void saveEntry(BatchEntry batchEntry)
    {
        batchEntryRepositry.save(batchEntry);
    }

    //R
    //GET

    public List<BatchEntry>getAll()
    {
        return batchEntryRepositry.findAll();
    }
    //R
    //GET
    public Optional<BatchEntry> findById(ObjectId id) {return batchEntryRepositry.findByID(id);}
    //D
    //Delete
    public void deleteById(ObjectId id)
    {
        batchEntryRepositry.deleteById(id);
    }


}
