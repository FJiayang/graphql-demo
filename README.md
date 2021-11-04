测试URL
```
http://localhost:8080/graphql
```

测试报文
```graphql
{
  bookById(id: "book-2"){
    id
    name
    pageCount
    author {
      firstName
      lastName
    }
  }
}# Write your query or mutation here
```