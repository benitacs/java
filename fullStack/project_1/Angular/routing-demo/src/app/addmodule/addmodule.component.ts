import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { courseService } from 'src/services/couseservice';
import { CourseComponent } from '../course/course.component';


@Component({
  selector: 'app-addmodule',
  templateUrl: './addmodule.component.html',
  styleUrls: ['./addmodule.component.css']
})
export class AddmoduleComponent implements OnInit {
  title: any
  id = CourseComponent.courseid


  constructor(private router: Router, private courseservice: courseService) { 
    console.log("Add Module componenet constructor Getting Course id : ",CourseComponent.courseid);
  }

  ngOnInit(): void {
  }
  addmodule(title: string) {
    //const course = {title,}
    //this.id = 5//this.coursecomponent.selectedCourse.id

    console.log("Add Module with Course id = ",this.id," and Title : ",title);
    this.courseservice.addmodule(title, this.id);
  
  }

}
