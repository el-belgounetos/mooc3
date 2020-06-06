package mooc3

class User {
    String username
    Date dateCreated

    static hasMany = [sales : SaleAd]
    static constraints = {
        username blank: false,nullable: false,unique: false
    }
}
