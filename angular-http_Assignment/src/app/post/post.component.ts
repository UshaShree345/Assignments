import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {
post;

  constructor(private http:HttpClient) {
    this.getPosts();
   }
   getPosts(){
    this,this.http.get('https://jsonplaceholder.typicode.com/posts').subscribe(data =>{
      console.log(data);
      this.post = data;
    })
  }
  ngOnInit(): void {
  }

}