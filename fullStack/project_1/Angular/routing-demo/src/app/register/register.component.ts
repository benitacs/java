import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { __param } from 'tslib';
//import { UserServiceClient } from 'src/services/user.service.client';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  
  userId :any

  constructor(private activateRoute: ActivatedRoute){}
  
  ngOnInit(): void {
   
   this.activateRoute.params.subscribe(params=>this.userId=params["userId"])

  }

}
