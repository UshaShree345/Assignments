import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProductService } from 'product.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {
  [x: string]: any;

  productToBeUpdated;

  constructor(private route: ActivatedRoute,
    private productService: ProductService) 
  { 
    this.route.queryParams.subscribe(data => {
      console.log('product to be updated', data);
      this.productToBeUpdated = data;
    })
  }

  ngOnInit(): void {
  }

  editProduct(form: NgForm) {
    this.productService.updateData(form.value).subscribe(response => {
      console.log('edit form value', form.value);
      console.log(response);
      form.reset();
      this.router.navigateByUrl('/products');
    });
  }

}
