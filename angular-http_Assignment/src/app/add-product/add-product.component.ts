import { Component, OnInit,OnDestroy } from '@angular/core';
import { interval,Subscription, from } from 'rxjs';
import { NgForm }from '@angular/forms';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit,OnDestroy {
  mySubscription:Subscription;
  constructor(private ProductService) {
   /* this.mySubscription=interval(1000).subscribe(data =>{
      console.log(data);
   });*/
  }
  postProduct(form:NgForm){
    this.ProductService.postData(form.value).subscribe(response=>{
     console.log(response);
     },error=>{
      console.log(error);
    });
  }
  ngOnInit(): void {
  }
  ngOnDestroy(){
    this.mySubscription.unsubscribe();
  }

}