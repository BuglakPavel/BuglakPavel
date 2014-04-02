package com.midnight.browsers;

public enum TypeBrowser {
	
	ChoiceFireFox("FireFox"),
	ChoiceChrome("Chrome");

    private String typeValue;
    
    private TypeBrowser(String type) {
        typeValue = type;
    }
    
    static public TypeBrowser getType(String pType) {
        for (TypeBrowser type: TypeBrowser.values()) {
            if (type.getTypeValue().equals(pType)) {
                return type;
            }
        }
        throw new RuntimeException("unknown type");
    }
    
    public String getTypeValue() {
        return typeValue;
    }
    
}
