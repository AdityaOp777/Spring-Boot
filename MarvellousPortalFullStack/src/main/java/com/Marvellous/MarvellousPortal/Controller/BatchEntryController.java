package com.Marvellous.MarvellousPortal.Controller;

import com.Marvellous.MarvellousPortal.Entity.BatchEntry;
import com.Marvellous.MarvellousPortal.service.BatchEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    @Autowired
    private BatchEntryService batchEntryService;

    @GetMapping
    public List <BatchEntry> GetAll()
    {
        return batchEntryService.getAll();
    }


    @PostMapping
    public String createEntry(@RequestBody BatchEntry myentry)
    {
        batchEntryService.saveEntry(myentry);
        return "Document inserted sucessfully";
    }


    @GetMapping("id/{myid}")
    public Optional<BatchEntry> GetBatchEntryById(@PathVariable ObjectId myid)
    {
        return batchEntryService.findByID(myid);
    }


    @DeleteMapping("id/{myid}")
    public Boolean DeleteBatchEntryById(@PathVariable ObjectId myid)
    {
        batchEntryService.deleteById(myid);
        return true;
    }


    @PutMapping("id/{myid}")
    public Optional<BatchEntry> UpdateBatchEntryById(@PathVariable ObjectId myid, @RequestBody BatchEntry myentry)
    {
        Optional<BatchEntry> old = batchEntryService.findById(myid);
        if(old != null)
        {
            old.setName(myentry.getName());
            old.setFees(myentry.getFees());

            batchEntryService.saveEntry(old);
        }
    }

}
