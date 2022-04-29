1. What is the delegation pattern ?
It is an object-oriented design pattern that allows object composition to achieve the same
code reuse as inheritance.

2. Why should I use it ?
Because it increases scalability, maintainability, reusability, testability, among others.

3. How do I know what can be refactored into a delegate ?
- UI unrelated stuff (for example, tipping, total product price from checkout in cornershop app)
- UI reusable stuff (for example, address selector which already exists)
- Cohesion between methods and dependencies. You may notice that some methods only use a group of
  dependencies, these dependencies can be extracted into a delegate
