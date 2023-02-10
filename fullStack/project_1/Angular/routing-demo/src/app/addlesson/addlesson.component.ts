import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { courseService } from 'src/services/couseservice';
import { CourseComponent } from '../course/course.component';

@Component({
  selector: 'app-addlesson',
  templateUrl: './addlesson.component.html',
  styleUrls: ['./addlesson.component.css']
})
export class AddlessonComponent implements OnInit {
title:any
id = CourseComponent.moduleid

  constructor(private router: Router,
    private courseservice: courseService) { 
      console.log("Add Lesson constructor Checking module id : ",CourseComponent.moduleid);
    }

  ngOnInit(): void {
  }
  addlesson(title: string) {

    this.courseservice.addlesson(title, this.id);
  }

}
