//import { HttpClient } from "@angular/common/http";
import { Injectable, Input } from "@angular/core";

@Injectable()
export class courseService {
  
    findallCourse=()=>
    fetch('http://localhost:8080/api/v1/courses').then(Response =>Response.json())
    //fetch('http://courseservice-env.eba-eikexim3.us-east-1.elasticbeanstalk.com/api/v1/courses').then(Response =>Response.json());

    
    async addcourse(course:any ) {
      let response = await fetch('http://localhost:8080/api/v1/courses/', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json;charset=utf-8'
          },
          body: JSON.stringify(course)
        });
        
        alert("Course Added!");
              
  }
    /*async addcourse(course:any ) {
      await fetch('http://courseservice-env.eba-eikexim3.us-east-1.elasticbeanstalk.com/api/v1/courses/', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json;charset=utf-8'
          },
          body: JSON.stringify(course)
        });
        
        alert("Course Added!");
              
  }
  async addmodule(title: any, id: any){
    console.log("Add Module with course id : ",id," and Title : ",title)
    
    await fetch(`http://courseservice-env.eba-eikexim3.us-east-1.elasticbeanstalk.com/api/v1/courses/${id}/module/`,{
      method: 'POST',
          headers: {
            'Content-Type': 'application/json;charset=utf-8'
          },
          body: JSON.stringify({"title":title})
    })
    alert("Module Added!");
  }*/

      async addmodule(title: any, id: any) {
      console.log("Add Module with Course id = ",id," and Title : ",title);
      let response = await fetch('http://localhost:8080/api/v1/courses/${id}/module/', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json;charset=utf-8'
          },
          body: JSON.stringify({"title":title})
        });
        
        alert("Module Added!");
              
  }

  /*async addlesson(title: any, id: any){
    console.log("Add Lesson with Module id : ",id," and Title : ",title)
    let response=await fetch(`http://courseservice-env.eba-eikexim3.us-east-1.elasticbeanstalk.com/api/v1/${id}/lesson`,{
      method: 'POST',
          headers: {
            'Content-Type': 'application/json;charset=utf-8'
          },
          body: JSON.stringify({"title":title})
    })
    alert("Lesson Added!");
  }
  */

  async addlesson(title: any, id: any ) {
    let response = await fetch('http://localhost:8080/api/v1/${id}/lesson', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({"title":title})
      });
      
      alert("Lesson Added!");
            
}

 

}