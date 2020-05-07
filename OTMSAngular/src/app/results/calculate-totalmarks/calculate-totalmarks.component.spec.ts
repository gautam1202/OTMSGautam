import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculateTotalmarksComponent } from './calculate-totalmarks.component';

describe('CalculateTotalmarksComponent', () => {
  let component: CalculateTotalmarksComponent;
  let fixture: ComponentFixture<CalculateTotalmarksComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CalculateTotalmarksComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CalculateTotalmarksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
