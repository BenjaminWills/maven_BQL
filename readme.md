# Bens Querying Language BQL

- [Bens Querying Language BQL](#bens-querying-language-bql)
- [BACKEND PLAN](#backend-plan)
  - [STORAGE](#storage)
  - [Querying storage blocks](#querying-storage-blocks)
  - [Query Syntax](#query-syntax)
    - [Creation](#creation)
    - [Reading](#reading)
    - [Updating](#updating)
    - [Deletion](#deletion)
    - [Access Control](#access-control)

# BACKEND PLAN

## STORAGE

The storage heirarchy looks like the following example:

```
STORAGE BLOCK 1
    |
    |
    ---- DATABASE 1
            |
            |
            ---- SCHEMA 1
                    |
                    |
                    ---- TABLE 1
    ---- DATABASE 2
            |
            |
            ---- SCHEMA 2
                    |
                    |
                    ---- TABLE 2
                    ---- TABLE 3
            ---- SCHEMA 3
                    |
                    |
                    ---- TABLE 4
STORAGE BLOCK 2
    |
    |
    ---- DATABASE 3
            |
            |
            ---- SCHEMA 4
                    |
                    |
                    ---- TABLE 5
```

We have `storage blocks` that will store data in a hierarchical way, `storage blocks` store `databases`, `databases` store `schemas`, and `schemas` store `tables`.

## Querying storage blocks

Currently I'm planning on creating an `API` that will connect to a BQL database and query using my own syntax. Perhaps I will start using a `command line`.

## Query Syntax

### Creation

placeholder

### Reading

placeholder

### Updating

placeholder

### Deletion

placeholder

### Access Control

placeholder
