import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserServiceClient } from 'src/services/user.service.client';
import { courseService } from 'src/services/couseservice';

@Component({
  selector: 'app-addcourse',
  templateUrl: './addcourse.component.html',
  styleUrls: ['./addcourse.component.css']
})
export class AddcourseComponent implements OnInit {
title: any;
author:any;

  constructor(private router:Router, private userService:UserServiceClient,
    private courseService: courseService) { }

  ngOnInit(): void {}
  addcourse(title: string, author: string) {
    const course = {title,author}
    this.courseService.addcourse(course);
    //this.courseService.addcourse(title, author);
  }

  GoTocourse(){
    this.router.navigate(['course'])
  }



}
