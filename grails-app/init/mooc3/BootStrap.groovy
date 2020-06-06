package mooc3

class BootStrap {

    def init = { servletContext ->
        ["toto","titi","tata"].each {
            def username ->
                def usr = new User(username: username)

                [1..5].each {
                    def saleIndex ->
                        def ad = new SaleAd(title: "ad $username $saleIndex", status: Boolean.TRUE, description: "ad $username $saleIndex", price: 2F)
                        //def ad = new SaleAd(title: "adaaaaaaaa", status: Boolean.TRUE, description: "adaaaaaaaaaa", price: 2F)

                        //ad.status=Boolean.TRUE
                        //ad.description="ad $username $saleIndex"
                        //ad.author=usr
                        //ad.price=2F
                        [1..3].each{
                            def illustrationIndex ->
                            ad.addToIllustrations(new Illustration(filename: "test $usr.username $illustrationIndex .png"))
                        }

                        usr.addToSales(ad)
                }
                usr.save()

        }

    }
    def destroy = {
    }
}
