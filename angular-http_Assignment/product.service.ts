import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'

})
export class ProductService{
  [x: string]: any;
    myURL='http://localhost:8080/spring_angular'

    constructor(private http: HttpClient){}



       postData(product){
           return this.http.post('http://localhost:8080/angularassignment/addProduct',product);
       }

       getData(){
           return this.http.get<any>('http://localhost:8080/angularassignment/getAllProducts')
       }
       deleteData(product) {
        return this.http.delete<any>('${this.myURL}delete-product/${product.id}');
    }


      /*  products=[
           {
               productName: 'Iphone',
               productPrice: 20000
           },
           {
            productName: 'Lenovo',
            productPrice: 10000
        },
        {
            productName: 'Nokia 6',
            productPrice: 3000
        }
       ] */
}