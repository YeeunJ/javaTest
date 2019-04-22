package edu.handong.csee.java.string;

class FamilyNamePrinter{
    private String[] stringNames;
    private String[] familyNames;
    private int size;

    FamilyNamePrinter(String names){
        stringNames = names.split(",");
        size = stringNames.length;
        familyNames = new String[size];
        for(int i = 0; i < size; i++){
            familyNames[i]= stringNames[i].trim().split(" ")[1];
        }
    }

    void printFamilyNames(){
        for(String name: familyNames){
            System.out.println(name.toUpperCase());
        }
    }

    public static void main(String[] args) {
        FamilyNamePrinter fnp = new FamilyNamePrinter(args[0]);
        fnp.printFamilyNames();
    }
}