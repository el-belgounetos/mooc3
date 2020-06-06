package mooc3

class SaleAd {
    String title
    String description
    Float price
    Boolean status = Boolean.FALSE
    Date dateCreated
    Date lastUpdated
    static belongsTo = [author: User]
    static hasMany = [illustrations: Illustration]
    static constraints = {
        title blank:false, nullable: false, minSize: 5, maxSize: 100
        description blank: false, nullable: false
        price min: 0F, scale: 2
        status nullable: false
    }
}
