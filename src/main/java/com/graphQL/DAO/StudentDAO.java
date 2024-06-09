package com.graphQL.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDAO {
    private int id;
    private String name;
    private String address;
    private char gender;
    private int rollNo;
}
