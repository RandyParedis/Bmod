cmake_minimum_required(VERSION 3.1)
set(PROJECT_NAME simtest)
project(${PROJECT_NAME})
set(CMAKE_CXX_STANDARD 11)
set(PEDSIM_LIB /usr/include/libpedsim)

file(GLOB_RECURSE SRC ../simulation/*)
list(APPEND SRC
"../actions/targetters.h"
"../actions/targetters.cpp"
)

add_executable(${PROJECT_NAME} main.cpp ${SRC})
target_include_directories(${PROJECT_NAME} PUBLIC ${PEDSIM_LIB})
target_include_directories(${PROJECT_NAME} PUBLIC ../)
target_link_libraries(${PROJECT_NAME} ${PEDSIM_LIB}/libpedsim.so)
