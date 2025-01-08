# Contributing Guidelines

Thank you for your interest in contributing to this project! To ensure a smooth and efficient collaboration, please follow these guidelines when contributing code, reporting issues, or suggesting features.

## Branching Strategy
We follow a structured branching strategy to organize our work effectively. Below are the branch types and their purposes:

### Branch Types
1. **`master`**:
   - The primary branch containing production-ready code.
   - Changes to this branch are made only after thorough testing and review.

2. **`default`**:
   - A staging branch for testing purposes before merging into `master`.
   - Final reviews and QA happen here.

3. **`dev`**:
   - The main development branch where active development occurs.
   - All feature and task branches should be merged into `dev` after review.

4. **Feature Branches (`feature/*`)**:
   - Used for developing new features.
   - Example: `feature/home-webpage`.

5. **Task Branches (`task/*`)**:
   - Used for specific tasks or bug fixes.
   - Examples:
     - `task/add-model`
     - `task/add-repository-and-service`
     - `task/add-validation`

6. **Fix Branches (`fix/*`)**:
   - Used for minor bug fixes that do not introduce new functionality.
   - Example: `fix/typo-in-readme`.

7. **Hotfix Branches (`hotfix/*`)**:
   - Used for critical fixes in the `master` branch.
   - Example: `hotfix/critical-login-issue`.

8. **Release Branches (`release/*`)**:
   - Used for preparing a new release.
   - Example: `release/v1.0.0`.

## Workflow
1. **Create a Branch**:
   - For new features, create a branch starting with `feature/`.
   - For specific tasks or fixes, create a branch starting with `task/` or `fix/` as needed.
   - For urgent fixes, use a `hotfix/` branch.
   - For release preparation, use a `release/` branch.
   - Branch names should be descriptive and follow the examples above.

2. **Make Commits**:
   - Commit messages should be clear and concise.
   - Use present-tense verbs (e.g., "Add validation for user input").

3. **Push Your Changes**:
   - Push your branch to the remote repository.

4. **Create a Pull Request (PR)**:
   - Open a pull request to merge your branch into `dev` (or `master` for hotfixes).
   - Provide a detailed description of the changes.
   - Ensure all checks (e.g., tests, linting) pass before requesting a review.

5. **Code Review**:
   - Address feedback from reviewers promptly.
   - Once approved, your branch will be merged into `dev` (or `master` for hotfixes).

6. **Testing and Release**:
   - After testing in `default`, changes will be merged into `master` for release.

## Coding Standards
- Follow the [clean code principles](https://www.goodreads.com/book/show/3735293-clean-code).
- Write meaningful comments for complex logic.
- Ensure your code is covered by tests (unit, integration, etc.).

## Reporting Issues
When reporting an issue, please include:
- A clear title and description of the problem.
- Steps to reproduce the issue.
- Expected vs. actual behavior.
- Relevant screenshots or logs, if applicable.

## Suggesting Features
To suggest a new feature:
- Open an issue with a detailed description of the feature.
- Explain the motivation and potential use cases.
- Include any relevant examples or references.

---
By following these guidelines, we can maintain a high-quality codebase and foster a productive collaboration. Thank you for contributing!
