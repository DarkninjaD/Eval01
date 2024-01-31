# Eval

Your objective for this eval is to complete the following problem.
Please fork from this repo and once complete perform a pull request.

Remember that you must demonstrate that you can write **TESTS** and **ERROR Handling** without breaking your code.

## Objective

We need a way to track and manage unit usage of funds. The core components of this app are

- Units
- Line Accounting.

Each unit should start with the following lines of accounting.

- Research, Development, Test, and Evaluation (RDT&E),
- Procurement, Operations and Maintenance (O&M),
- Military Personnel (MILPERS)

### Feature Requirements

- The Unit should also be able to perform deductions or additions using one function to any lines of account with $Y$ amount.
- There will only be only one Line of Account for any give account. ie: O&M, RDT&E, MILPERS will be shared with all Units.
- Each Line of Account will have an internal balance that deductions and additions will be done against.
- The internal balance with in the Line of Account should be private and you must provide a way for units to request the current balance.
- the Unit should be able to set a "limit" for the amount it can deduct against in any account. the account will keep, track and warn the unit if it exceeds it's limit but not stop the operation.
- Once all accounting is done print out the name of all units and their limit they set as well the name of all accounts used and internal balance.
