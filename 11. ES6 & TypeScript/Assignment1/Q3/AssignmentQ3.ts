        var order = {
            id : 1,
            title : "Cappuccino",
            price : 150
        }

        function getOrder(){
            return order;
        }

        function getPrice(){
            return order.price;
        }

        console.log("Order detailes : ",getOrder());
        console.log("Order price : "+getPrice());
        