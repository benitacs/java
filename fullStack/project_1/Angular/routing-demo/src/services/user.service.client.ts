import { Injectable } from "@angular/core";
import {HttpClient } from '@angular/common/http'
import { retry } from "rxjs";

@Injectable()
export class UserServiceClient{

    users=[
        {id:1,username:'beni',Password:'123'},
        {id:2,username:'jo',Password:'111'}
    ]
    courses=[{}];
    username: any;
    Password: any;
    Title: any;
    
findUser(username: string, Password:string){
    for(let i=0;i<this.users.length;i++){
        console.log(this.users.length)
        if(username === this.users[i].username && Password === this.users[i].Password){
            return this.users[i]
        }
    }
    return null
}
addUser(username: string, Password:string){

    console.log("Array Length Before Registering : "+this.users.length)

    //VARIABLE TO CHECK IF REGISTER WORKING
    let arrayLen : number = this.users.length

    this.users.push({id:this.users.length+1,username: username,Password: Password})

    console.log("Array Length After Registering : "+this.users.length)
    console.log(" AFter Register Function : ",this.users[this.users.length-1].id,this.users[this.users.length-1].username,this.users[this.users.length-1].Password)

    if(arrayLen < this.users.length){
        //console.log(" In Register Function ")
        return this.users[arrayLen]
    }
    return this.users[arrayLen]

}



}

