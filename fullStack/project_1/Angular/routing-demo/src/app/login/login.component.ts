import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserServiceClient } from 'src/services/user.service.client';
import { RegisterComponent } from '../register/register.component';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
username: any;
Password: any;
RegisterComponent: any;

constructor(private router:Router, private userService: UserServiceClient) { }

ngOnInit(): void {
}

login(username: any,Password: any) {
  console.log(username,Password)
  const user = this.userService.findUser(username,Password)
  if(user != null)
  {
    console.log("LOGIN SUCCESSFULL")
    this.router.navigate(['/profile',user.id])
  }
  else{
    console.log("INVALID CREDENTIAL")
  }

//if(username === "beni" && Password==="123"){
  //this.router.navigate(['/profile']);
}

register(username:any,Password:any){
  console.log("In Login Component ",username,Password)
  const user = this.userService.addUser(username, Password)
  
  if(user != null){
    console.log("Register Successfully !");
    this.router.navigate(['/register',user.id])
  }
  else{
    console.log("Opps Try Again !")
  }
}


  
//throw new Error('Method not implemented.');
}



  

