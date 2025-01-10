# Ecommerce Multi Vendor

## Project Overview

The **Ecommerce Multi Vendor** platform is an online marketplace where customers can purchase products, sellers can manage their store and products, and admins can oversee the entire platform. The platform supports features like product management, order tracking, payment gateways, and more. It utilizes modern technologies like **Spring Boot**, **React**, **MySQL**, **JWT** for authentication, and integrates **Razorpay** and **Stripe** for payments.

---

## Technologies Used

### **Backend (Spring Boot)**
- **Spring Boot**: For building and running the backend API.
- **Spring Security**: For securing the application and handling authentication.
- **JWT (JSON Web Token)**: For secure authentication.
- **Java Mail Sender**: For sending emails to users.
- **Spring Data JPA**: For handling database operations with MySQL.
  
### **Frontend (React)**
- **React**: For building the dynamic and responsive user interface.
- **Redux Toolkit**: For managing global state across the app.
- **MUI**: Material UI library for styling components.
- **Tailwind CSS**: For utility-first CSS styling.
- **Formik & Yup**: For handling forms and validations.
- **React Router Dom**: For client-side routing.
- **Axios**: For making HTTP requests to the backend.

### **Payment Gateways**
- **Razorpay**: For Indian users to make payments.
- **Stripe**: For International users to make payments.

---

## Features

### **Customer Features**
1. **Chatbot for Queries**
   - Order History
   - Cart Management
   - Product Details
2. **Product Management**
   - View Products
   - Filter & Sort Products
   - Product Details
3. **Cart Management**
   - Add, Update, Remove Cart Items
4. **Checkout Process**
   - Apply Coupons
   - Manage Shipping Addresses
   - Razorpay & Stripe Payment Gateway Integration
5. **Order History**
   - View Past Orders
   - Cancel Orders
6. **User Account Management**
   - Personal Information Management
7. **Review & Rating**
   - Submit Reviews for Products
8. **Wishlist**
   - Add/Remove Products from Wishlist

---

### **Seller Features**
1. **Seller Dashboard**
   - View Earnings (Today, Last 7 Days, Last 12 Months)
2. **Product Management**
   - Create and Manage Products
   - Manage Orders
3. **Payment & Transaction Management**
   - Track Payments & Transaction History
4. **Seller Profile Management**
   - Edit and Update Seller Information

---

### **Admin Features**
1. **Admin Dashboard**
   - Manage Users and Sellers
2. **Seller Management**
   - Approve, Suspend, or Delete Sellers
3. **Coupon Management**
   - Create, Edit, Delete Coupons
4. **Home Page Management**
   - Customize the Home Page
5. **Deal Management**
   - Manage Promotional Offers and Deals

---

## Entity Relationships

- **User** can have multiple **Addresses**, **Orders**, **Reviews**, **Transactions**, and one **Wishlist**.
- **Address** is associated with **User** and **Order**.
- **Cart** has **CartItems**, and is linked to a **User**.
- **Product** belongs to **Seller** and **Category**, and can have multiple **Reviews**.
- **Order** contains multiple **OrderItems** and links to **Address** and **User**.
- **PaymentOrder** is associated with **User** and multiple **Orders**.
- **Seller** can manage **Products**, **Transactions**, and a **SellerReport**.

---

## API Endpoints

### **Authentication Endpoints**
- **POST** `/api/auth/signup`: Create a new user account.
- **POST** `/api/auth/login`: Authenticate a user and return JWT token.

### **Product Endpoints**
- **GET** `/api/products`: Fetch a list of products.
- **GET** `/api/products/{id}`: Fetch detailed information for a specific product.

### **Order Endpoints**
- **GET** `/api/orders`: Get all orders of a user.
- **POST** `/api/orders`: Create a new order.
- **PUT** `/api/orders/{id}`: Update the order details.

### **Payment Endpoints**
- **POST** `/api/payment/razorpay`: Process payment for Indian users via Razorpay.
- **POST** `/api/payment/stripe`: Process payment for international users via Stripe.

### **Coupon Endpoints**
- **POST** `/api/coupons`: Create a new coupon.
- **GET** `/api/coupons`: List all coupons.

---

## **Setup Instructions**

### Prerequisites
- **JDK 17 or later** for running the backend.
- **Node.js** and **npm** for the frontend.
- **MySQL** for the database.

### **Backend Setup (Spring Boot)**

1. Clone the repository:
   ```bash
   git clone https://github.com/ArjunSinghShekhawat/Ecommerce-Multivendor-Website.git
