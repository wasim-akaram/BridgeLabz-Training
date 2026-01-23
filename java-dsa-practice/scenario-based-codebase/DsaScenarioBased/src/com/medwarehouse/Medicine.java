package com.medwarehouse;

import java.time.LocalDate;

class Medicine 
{
    String name;
    LocalDate expiryDate; 

    Medicine(String name, LocalDate localDate) 
    {
        this.name = name;
        this.expiryDate = localDate;
    }
}