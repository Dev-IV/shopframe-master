package ru.web.learnup.shopframe;

class Good implements Comparable<Good>{
    private final String vendorCode;
    private String name;

    public Good(String vendorCode, String name) {
        this.vendorCode = vendorCode;
        this.name = name;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Good o) {
        return name.compareTo(o.getName());
    }
}
