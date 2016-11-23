package com.MechLIB.Data.TextDatabase;

/**
 * Created by Golqaer on 22.11.2016.
 */
public class Table {
    protected String keyField=null; //ключевое поле
    protected String name; //имя таблицы
    protected String dbFolder; //папка БД
    protected String[] fields; //поля
    protected boolean allowEmpty []; //может ли поле быть пустым

    public void AddData(String [] data) throws AddDataException
    {
        //проверить совпадает ли количество данных с кол-во полей в таблице
        if (data.length!=fields.length){
            throw new AddDataException("Количество данных, должно совпадать с количеством полей");
        }

    }


    //GET ключевое поле
    public String KeyField(){
        return keyField;
    }

    //SET ключевое поле
    public void KeyField(String value){
        keyField=value;
    }

    class AddDataException extends Exception{
        public AddDataException(String message){
            super(message);
        }
    }
}
