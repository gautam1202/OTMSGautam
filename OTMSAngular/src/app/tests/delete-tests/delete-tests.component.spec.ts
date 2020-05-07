import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteTestsComponent } from './delete-tests.component';

describe('DeleteTestsComponent', () => {
  let component: DeleteTestsComponent;
  let fixture: ComponentFixture<DeleteTestsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeleteTestsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeleteTestsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
